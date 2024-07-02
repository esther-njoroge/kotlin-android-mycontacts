package com.example.mycontacts

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        }
    fun displayContacts(){
        val contact1 = Contact("Anna", "0734567892", "annie@gmail.com", "")
        val contact2 = Contact("Abraham", "0734567891", "annie@gmail.com", "")
        val contact3 = Contact("Cate", "0734567392", "annie@gmail.com", "")
        val contact4 = Contact("Caro", "0734567892", "annie@gmail.com", "")
        val contact5 = Contact("Diana", "0734567892", "annie@gmail.com", "")
        val contact6 = Contact("Dylan", "0734967892", "annie@gmail.com", "")
        val contact7 = Contact("Edward", "0736567842", "annie@gmail.com", "")
        val contact8 = Contact("Effie", "0734567892", "annie@gmail.com", "")
        val contact9 = Contact("Hellen", "0734587862", "annie@gmail.com", "")
        val contact10 = Contact("Hellen", "0734587862", "annie@gmail.com", "")
        val contact11 = Contact("Hellen", "0734587862", "annie@gmail.com", "")


        val contactList = listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9)
         val contactsAdapter = ContactsAdapter(contactList)
        binding.rvContacts.adapter = contactsAdapter
    }
    }


