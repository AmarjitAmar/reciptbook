package com.example.dell.first3;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;

import static com.example.dell.first3.R.id.container;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Flavour_Fragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Flavour_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Flavour_Fragment extends Fragment  {
    GridView gridview;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Flavour_Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Flavour_Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Flavour_Fragment newInstance(String param1, String param2) {
        Flavour_Fragment fragment = new Flavour_Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
      View v=inflater.inflate(R.layout.fragment_flavour_, container, false);
            gridview=(GridView)v.findViewById(R.id.gridview);
            // ArrayAdapter a=new ArrayAdapter(Grid.this,);
        GridImages gi=new GridImages(getContext());
            gridview.setAdapter(new GridImages(v.getContext()));
        /*Intent in=new Intent(Grid.this, Listview.class);
        startActivity(in);

        finish();


*/


            gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    switch(i) {
                        case 0:
                            Intent ad=new Intent(getContext(),Listview.class);
                            startActivity(ad);
                            break;
                        case 1:
                            Intent ob=new Intent(getContext(),Chiness.class);
                            startActivity(ob);
                            break;
                        case 2:
                            Intent ac=new Intent(getContext(),Franchh.class);
                            startActivity(ac);
                            break;
                        case 3:
                            Intent an=new Intent(getContext(),Italiann.class);
                            startActivity(an);
                            break;

                    }
                }
            });




        return v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }



    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
