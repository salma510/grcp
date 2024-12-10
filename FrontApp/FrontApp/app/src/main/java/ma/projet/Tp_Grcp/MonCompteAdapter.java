package ma.projet.Tp_Grcp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ma.projet.grcp.R;
import ma.projet.grpc.stubs.Compte;

public class MonCompteAdapter extends RecyclerView.Adapter<MonCompteAdapter.CompteViewHolder> {





    
    private List<Compte> comptes;

    public MonCompteAdapter(List<Compte> comptes) {
        this.comptes = comptes;
    }

    @NonNull
    @Override
    public CompteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);
        return new CompteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CompteViewHolder holder, int position) {







        Compte compte = comptes.get(position);
        holder.tvSolde.setText("Solde: " + compte.getSolde());
        holder.tvDateCreation.setText("Date: " + compte.getDateCreation());
        holder.tvType.setText("Type: " + compte.getType());
    }

    @Override
    public int getItemCount() {
        return comptes.size();
    }






    static class CompteViewHolder extends RecyclerView.ViewHolder {
        TextView tvCompteId, tvSolde, tvDateCreation, tvType;

        public CompteViewHolder(@NonNull View itemView) {
            super(itemView);
            tvCompteId = itemView.findViewById(R.id.tvCompteId);
            tvSolde = itemView.findViewById(R.id.tvSolde);
            tvDateCreation = itemView.findViewById(R.id.tvDateCreation);
            tvType = itemView.findViewById(R.id.tvType);
            tvCompteId.setVisibility(View.GONE);
        }
    }
}
