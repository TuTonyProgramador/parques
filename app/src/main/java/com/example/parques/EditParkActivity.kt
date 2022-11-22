package com.example.parques

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.parques.databinding.ActivityEditParkBinding

class EditParkActivity : ActivityWhithMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_park)
        val binding = ActivityEditParkBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tag=""

        binding.guardar.setOnClickListener {
            /*Log.d(tag, "El nombre del parque es: " + binding.nombre.text + ", la descripcion" + binding.descri.text + ", el teléfono" + binding.telefono.text + " y la web " + binding.web.text)
            if (binding.deporte.isChecked)
                Log.d(tag, "Las actividades del parque son: ${binding.deporte.text}")

            if (binding.parqueinfantil.isChecked)
                Log.d(tag, "Las actividades del parque son: ${binding.parqueinfantil.text}")

            if (binding.restaurante.isChecked)
                Log.d(tag, "Las actividades del parque son: ${binding.restaurante.text}")

            if (binding.zonademascota.isChecked)
                Log.d(tag, "Las actividades del parque son: ${binding.zonademascota.text}")

            // Mostrar spinner
            Log.d(tag,"La hora de apertura es: ${binding.spinner.selectedItem} y la hora de cierre es: ${binding.spinner2.selectedItem}")*/

            val miDialogo = MiDialogFragment()
            miDialogo.show(supportFragmentManager, "MiDialogo")
        }
    }
}