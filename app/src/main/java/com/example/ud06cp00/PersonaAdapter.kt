package com.example.ud06cp00

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ud06cp00.databinding.ItemPersonaBinding

class PersonaAdapter(private val listaPersonas: List<Persona>) : RecyclerView.Adapter<PersonaAdapter.PersonaViewHolder>() {

    class PersonaViewHolder(val binding: ItemPersonaBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonaViewHolder {
        val binding = ItemPersonaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PersonaViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PersonaViewHolder, position: Int) {
        val persona = listaPersonas[position]

        holder.binding.ivPersona.setImageResource(persona.imagen)
        holder.binding.tvNombre.text = persona.nombre
        holder.binding.tvDescripcion.text = persona.descripcion
    }

    override fun getItemCount(): Int {
        return listaPersonas.size
    }
}