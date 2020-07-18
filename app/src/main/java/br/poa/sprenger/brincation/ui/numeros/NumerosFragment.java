package br.poa.sprenger.brincation.ui.numeros;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import br.poa.sprenger.brincation.R;

public class NumerosFragment extends Fragment {
/*    private View view;
    private ImageView um, dois, tres, quatro, cinco, seis;

    private void loadVars(){

    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_numeros, container, false);
    }

    public NumerosFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}