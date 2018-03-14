package anim.qy.com.anim;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import anim.qy.com.anim.bean.Anim;

/**
 * Created by Alter on 2018/3/13.
 */

public class Adapter extends RecyclerView.Adapter{

    private List<Anim> data = new ArrayList<>();

    private IItemlistener itemlistener;

    public void setItemlistener(IItemlistener itemlistener) {
        this.itemlistener = itemlistener;
    }

    public void setData(List<Anim> anims){
        data = anims;
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ItemViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item,null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Anim anim = data.get(position);
        ((ItemViewHolder)holder).setData(anim,position);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder{

        private TextView textView;
        public ItemViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.itemName);
        }

        public void setData(final Anim anim, final int position){
            textView.setText(anim.getName());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (itemlistener != null)
                        itemlistener.onClick(anim,position);
                }
            });
        }
    }
}
