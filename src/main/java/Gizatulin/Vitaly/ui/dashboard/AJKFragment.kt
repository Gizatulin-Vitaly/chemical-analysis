package Gizatulin.Vitaly.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import Gizatulin.Vitaly.databinding.AjkLayoutBinding

class AJKFragment : Fragment() {

    private var _binding: AjkLayoutBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val AJKViewModel =
            ViewModelProvider(this).get(AJKViewModel::class.java)

        _binding = AjkLayoutBinding.inflate(inflater, container, false) // Исправлено на правильное имя привязки макета
        val root: View = binding.root

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}