package com.example.androidappcoffee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TimePicker


class payment : Fragment() {
    private lateinit var editTextFullName: EditText
    private lateinit var editTextPhoneNumber: EditText
    private lateinit var editTextEmail: EditText
    private lateinit var editTextAddress: EditText
    private lateinit var editTextCity: EditText
    private lateinit var editTextZipCode: EditText
    private lateinit var editTextCountry: EditText
    private lateinit var editTextCardHolderName: EditText
    private lateinit var editTextCardNumber: EditText
    private lateinit var editTextExpiryDate: EditText
    private lateinit var editTextCVV: EditText
    private lateinit var timePicker: TimePicker
    private lateinit var buttonPlaceOrder: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_payment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize views
        editTextFullName = view.findViewById(R.id.editTextFullName)
        editTextPhoneNumber = view.findViewById(R.id.editTextPhoneNumber)
        editTextEmail = view.findViewById(R.id.editTextEmail)
        editTextAddress = view.findViewById(R.id.editTextAddress)
        editTextCity = view.findViewById(R.id.editTextCity)
        editTextZipCode = view.findViewById(R.id.editTextZipCode)
        editTextCountry = view.findViewById(R.id.editTextCountry)
        editTextCardHolderName = view.findViewById(R.id.editTextCardHolderName)
        editTextCardNumber = view.findViewById(R.id.editTextCardNumber)
        editTextExpiryDate = view.findViewById(R.id.editTextExpiryDate)
        editTextCVV = view.findViewById(R.id.editTextCVV)
        timePicker = view.findViewById(R.id.timePicker)
        buttonPlaceOrder = view.findViewById(R.id.buttonPlaceOrder)

        // Add text watchers for validation
        val textWatcher = createTextWatcher()
        editTextFullName.addTextChangedListener(textWatcher)
        editTextPhoneNumber.addTextChangedListener(textWatcher)
        editTextEmail.addTextChangedListener(textWatcher)
        editTextAddress.addTextChangedListener(textWatcher)
        editTextCity.addTextChangedListener(textWatcher)
        editTextZipCode.addTextChangedListener(textWatcher)
        editTextCountry.addTextChangedListener(textWatcher)
        editTextCardHolderName.addTextChangedListener(textWatcher)
        editTextCardNumber.addTextChangedListener(textWatcher)
        editTextExpiryDate.addTextChangedListener(textWatcher)
        editTextCVV.addTextChangedListener(textWatcher)




        }
    }