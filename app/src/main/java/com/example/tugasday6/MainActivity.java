package com.example.tugasday6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private DetailModel detailModel;
    private ArrayList<RayElektronik> diorModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView = findViewById(R.id.recyleview);
        detailModel = new DetailModel(this, diorModel);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(detailModel);
    }

    private void getData() {
        diorModel = new ArrayList<>();
        diorModel.add(new RayElektronik("Bobby Sweater",R.drawable.mesincuci1, "Rp. 41.000.000,00", "Color : Blue Cashmere", "Type : Regular fit", "Size : M", "Back Length : 68 cm", "Collar Type : Ribbed round neck, cuffs and hem", "Made In Italy"  ));
        diorModel.add(new RayElektronik("Christian Dior Relaxed-Fit T-Shirt", R.drawable.mesincuci2, "Rp. 20.000.000,00", "Color : Beige", "Type : Relaxed fit", "Size : M", "Back Length : 68 cm", "Collar Type : Ribbed crew neck", "Made In Italy"  ));
        diorModel.add(new RayElektronik("Coach Jacket", R.drawable.mesincuci3, "Rp. 30.000.000,00", "Color : Beige", "Type : Cassual fit", "Size : M", "Back Length : 70 cm", "Collar Type : Shirt Collar", "Made In Japan" ));
        diorModel.add(new RayElektronik("DIOR AND OTANI WORKSHOP Long-Sleeved Polo Shirt", R.drawable.mesincuci4, "Rp. 40.000.000,00", "Color : Red Cutton", "Type : Cassual fit", "Size : M", "Back Length : 68 cm", "Collar Type : Shirt Collar", "Made In Italy" ));
        diorModel.add(new RayElektronik("Prince of Wales-Breasted Jacket", R.drawable.mesincuci5, "Rp. 50.000.000,00", "Color : Gray Wool", "Type : Cassual fit", "Size : L", "Back Length : 76 cm", "Collar Type : Pointed Lapels", "Made In Italy"   ));
        diorModel.add(new RayElektronik("Dior Buffalo Lace-Up Boot", R.drawable.tv1, "Rp. 29.000.000,00","Color : Black", "Type : Boot" , "Weight : 24 ounces", "Size : 43 cm", "Shoe Type : High-top" , "Made In Italy"));
        diorModel.add(new RayElektronik("B57 Mid-Top Sneaker", R.drawable.tv2, "Rp. 24.000.000,00", "Color : Blue and Cream","Type : Sneaker", "Weight : 16 ounces","Size : 39 cm" , "Shoe Type : Mid-top", "Made In Italy" ));
        diorModel.add(new RayElektronik("B9S Skater Sneaker", R.drawable.tv3, "Rp. 43.000.000,00", "Color : Beige", "Type : Sneaker", "Weight : 23.5 ounces", "Size : 42 cm", "Shoe Type : Low-top", "Made In Italy" ));
        diorModel.add(new RayElektronik("Dior Buffalo Loafer", R.drawable.tv4, "Rp. 28.000.000,00","Color : Black", "Type : Loafer", "Weight : 23.5 ounces","Size : 42 cm", "Shoe Type : Low-top", "Made In Italy" ));
        diorModel.add(new RayElektronik("Dior Granville Loafer", R.drawable.tv5, "Rp. 20.000.000,00", "Color : Brown Suede", "Type : Loafer", "Weight : 12.5 ounces", "Size : 36 cm", "Shoe Type : Low-top", "Made In Italy" ));
        diorModel.add(new RayElektronik("Dior3D S1I", R.drawable.kulkas1, "Rp. 9.900.000,00", "Color : Khaki", "Type : Rectangular Sunglasses","Lenses : 2 Inches", "Bridge : 0.5 Inches", "Frame : Khaki nylon Cannage Frame", "Made In Italy"));
        diorModel.add(new RayElektronik("NeoDior S4U", R.drawable.kulkas2, "Rp. 10.500.000,00", "Color : Gray", "Type : Rectangular Sunglasses", "Lenses : 2.5 Inches", "Bridge : 0.5 Inches", "Frame : Gunmetal frame", "Made In Italy"));
        diorModel.add(new RayElektronik("CD Diamond M1U", R.drawable.kulkas3, "Rp. 11.500.000,00", "Color : Gray", "Type : Rectangular Sunglasses", "Lenses : 2.5 Inches", "Bridge : 0.5 Inches", "Frame : Gunmetal frame", "Made In Italy"));
        diorModel.add(new RayElektronik("CD Diamond S6F", R.drawable.kulkas4, "Rp. 11.800.000,00", "Color : Transparant Green", "Type : Square Sunglasses", "Lenses : 2 Inches", "Bridge : 0.5 Inches","Frame : Transparent beige acetate frame", "Made In Italy"));
        diorModel.add(new RayElektronik("DiorBlackSuit S10I", R.drawable.kulkas5, "Rp. 7.460.000,00", "Color : Translucent Beige and Brown", "Type : Rectangular Sunglasses", "Lenses : 2 Inches", "Bridge : 1 Inches", "Frame : Effect acetate frame", "Made In Italy"));
    }
}