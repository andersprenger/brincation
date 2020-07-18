package br.poa.sprenger.brincation.ui.numeros;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import br.poa.sprenger.brincation.R;

public class NumerosFragment extends Fragment implements View.OnClickListener {
    private View view;
    private MediaPlayer mediaPlayer;
    private ImageView um, dois, tres, quatro, cinco, seis;

    private void loadVars() {
        um = view.findViewById(R.id.numeroUm);
        dois = view.findViewById(R.id.numeroDois);
        tres = view.findViewById(R.id.numeroTres);
        quatro = view.findViewById(R.id.numeroQuatro);
        cinco = view.findViewById(R.id.numeroCinco);
        seis = view.findViewById(R.id.numeroSeis);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_numeros, container, false);
        loadVars();
        loadConfigs();
        return view;
    }

    private void loadConfigs() {
        um.setOnClickListener(this);
        dois.setOnClickListener(this);
        tres.setOnClickListener(this);
        quatro.setOnClickListener(this);
        cinco.setOnClickListener(this);
        seis.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.numeroUm:
                setMediaPlayer(R.raw.one);
                break;
            case R.id.numeroDois:
                setMediaPlayer(R.raw.two);
                break;
            case R.id.numeroTres:
                setMediaPlayer(R.raw.three);
                break;
            case R.id.numeroQuatro:
                setMediaPlayer(R.raw.four);
                break;
            case R.id.numeroCinco:
                setMediaPlayer(R.raw.five);
                break;
            case R.id.numeroSeis:
                setMediaPlayer(R.raw.six);
                break;
        }
    }

    private void setMediaPlayer(int id) {
        mediaPlayer = MediaPlayer.create(getActivity(), id);
        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
                mediaPlayer = null;
            }
        });
    }

    public NumerosFragment() {
        // Required empty public constructor
    }

}