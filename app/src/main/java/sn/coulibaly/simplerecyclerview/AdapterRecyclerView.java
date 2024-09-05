package sn.coulibaly.simplerecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder> {
    Context context;
    ArrayList<Pays> paysArrayList;

    public AdapterRecyclerView(Context context, ArrayList<Pays> paysArrayList) {
        this.context = context;
        this.paysArrayList = paysArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_container, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.nomPays.setText(paysArrayList.get(position).getNomPays());
        holder.drapeauPays.setImageResource(paysArrayList.get(position).getDrapeauPays());

        holder.nomPays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Vous êtes sur : " + holder.nomPays.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return paysArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView drapeauPays;
        TextView nomPays;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            drapeauPays = itemView.findViewById(R.id.flag);
            nomPays = itemView.findViewById(R.id.nomPays);
        }
    }
}
