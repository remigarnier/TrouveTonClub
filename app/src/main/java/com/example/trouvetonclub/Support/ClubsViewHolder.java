package com.example.trouvetonclub.Support;

import static android.app.ActivityManager.getMyMemoryState;
import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import com.example.trouvetonclub.Metier.Annonce;
import com.example.trouvetonclub.ProfilActivity;
import com.example.trouvetonclub.R;
import com.example.trouvetonclub.Metier.Clubs;
import com.example.trouvetonclub.SuiteActivity;


public class ClubsViewHolder extends RecyclerView.ViewHolder {
    private final TextView tvClub;
    public ClubsViewHolder(final View view) {
        super(view);
        tvClub = (TextView) view.findViewById(R.id.info_club);
        tvClub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent laSuite = new Intent(view.getContext(), ProfilActivity.class);
                String leClub = tvClub.getText().toString();Log.i("ClubsVH", leClub);
                String [] lesInfos = leClub.split(" - ");Log.i("ClubsVH", lesInfos.toString());
                laSuite.putExtra("leClub", lesInfos[1]);
                laSuite.putExtra("laPosition", lesInfos[0]);
                view.getContext().startActivity(laSuite);
            }
        });
    }
    /*public void remplirViewHolder(String lesinfos) {
        tvAnnonce.setText(lesinfos);
    }*/
    public void remplirViewHolder(String leClub) {
        String lesInfos[] = leClub.split("-");
        String leNom = lesInfos[1];
        tvClub.setText(leNom);
    }
    public void remplirViewHolder(Clubs leClub, int position) {
        String lesinfos = leClub.getNom_club()+"\n Nom du club : "+leClub.getemail_club()+"\n Salaire : "+leClub.getNum_tel()+
                "€\n Déscription : "+leClub.getCde_departement()+"\n Le club : "+leClub.getadresse_club();
        Log.i("messageVH","les infosVH : "+lesinfos.toString());
        //String ladescription = lAnnonce.getDescription();
        Log.i("ViewHolder", "position du clic");
        tvClub.setText(position+" - "+lesinfos);
    }
}


