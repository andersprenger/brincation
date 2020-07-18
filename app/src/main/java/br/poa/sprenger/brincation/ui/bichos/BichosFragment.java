package br.poa.sprenger.brincation.ui.bichos;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import br.poa.sprenger.brincation.R;

public class BichosFragment extends Fragment implements View.OnClickListener {
    private View view;
    private MediaPlayer mediaPlayer;
    private ImageView cachorro, gato, leao, macaco, ovelha, vaca;

    private void loadVars() {
        cachorro = view.findViewById(R.id.cachorro);
        gato = view.findViewById(R.id.gato);
        leao = view.findViewById(R.id.leao);
        macaco = view.findViewById(R.id.macaco);
        ovelha = view.findViewById(R.id.ovelha);
        vaca = view.findViewById(R.id.vaca);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_bichos, container, false);
        loadVars();
        loadConfigs();
        return view;
    }

    private void loadConfigs() {
        cachorro.setOnClickListener(this);
        gato.setOnClickListener(this);
        leao.setOnClickListener(this);
        macaco.setOnClickListener(this);
        ovelha.setOnClickListener(this);
        vaca.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cachorro:
                mediaPlayer(R.raw.dog);
                break;
            case R.id.gato:
                mediaPlayer(R.raw.cat);
                break;
            case R.id.leao:
                mediaPlayer(R.raw.lion);
                break;
            case R.id.macaco:
                mediaPlayer(R.raw.monkey);
                break;
            case R.id.ovelha:
                mediaPlayer(R.raw.sheep);
                break;
            case R.id.vaca:
                mediaPlayer(R.raw.cow);
                break;

        }
    }

    private void mediaPlayer(int id){
        mediaPlayer = MediaPlayer.create(getActivity(), id);
        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
    }

    public BichosFragment() {
        // Required empty public constructor
    }
}