package samples.exoguru.gridlayout;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Edwin on 28/02/2015.
 */
public class GridAdapter  extends RecyclerView.Adapter<GridAdapter.ViewHolder> {

    List<EndangeredItem> mItems;

    public GridAdapter() {
        super();
        mItems = new ArrayList<EndangeredItem>();
        EndangeredItem species = new EndangeredItem();
        species.setName("Big Night Pizza");
        species.setThumbnail(R.drawable.bignightpizza);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("Berry Squares");
        species.setThumbnail(R.drawable.blueberryoatmealsquares);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("Crock Pot Roast");
        species.setThumbnail(R.drawable.crockpotroast);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("Curried Lentils");
        species.setThumbnail(R.drawable.curriedlentilsandrice);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("York Shirepuds");
        species.setThumbnail(R.drawable.micsyorkshirepuds);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("Oatmeal Cookies");
        species.setThumbnail(R.drawable.oldfashionedoatmealcookies);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("Asparagus");
        species.setThumbnail(R.drawable.roastedasparagus);
        mItems.add(species);

        species = new EndangeredItem();
        species.setName("Acai Rice");
        species.setThumbnail(R.drawable.acairice);
        mItems.add(species);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.grid_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        EndangeredItem nature = mItems.get(i);
        viewHolder.tvspecies.setText(nature.getName());
        viewHolder.imgThumbnail.setImageResource(nature.getThumbnail());

        
    }

    @Override
    public int getItemCount() {

        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView imgThumbnail;
        public TextView tvspecies;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView)itemView.findViewById(R.id.img_thumbnail);
            tvspecies = (TextView)itemView.findViewById(R.id.tv_species);
        }
    }

}
