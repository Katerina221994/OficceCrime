package ru.bigNerd.officecrimes

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.bigNerd.officecrimes.databinding.FragmentCrimeBinding

class CrimeFragment:Fragment() {
    private lateinit var binding: FragmentCrimeBinding
    private lateinit var  crime: Crime
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        crime = Crime()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCrimeBinding. inflate(inflater,container,false)

        binding.crimeDate.apply {
            text = crime.date.toString()
            isEnabled = false
        }
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        val titleWatcher = object:TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) { //возвращает строку котрая используется для заголовка
                crime.title = s.toString()
            }

            override fun afterTextChanged(s: Editable?) {

            }

            }
        binding.crimeTitle.addTextChangedListener(titleWatcher)

        binding.crimeSolved.apply {
            setOnCheckedChangeListener{_,isCheked ->
                crime.isSolved = isCheked

        }

        }

    }
}