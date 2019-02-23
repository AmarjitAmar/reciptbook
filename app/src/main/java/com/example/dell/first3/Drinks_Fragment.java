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
import android.widget.GridView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Drinks_Fragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Drinks_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Drinks_Fragment extends Fragment implements AdapterView.OnItemClickListener{
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Drinks_Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Drinks_Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Drinks_Fragment newInstance(String param1, String param2) {
        Drinks_Fragment fragment = new Drinks_Fragment();
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
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_drinks_, container, false);
        GridView gd=(GridView)v.findViewById(R.id.gridd);
        driconst dq=new driconst(getContext());
        gd.setAdapter(new driconst(v.getContext()));
        gd.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 0:
                        Intent ap=new Intent(getContext(),R1.class);
                        startActivity(ap);
                        break;
                    case 1:
                        Intent bp=new Intent(getContext(),R2.class);
                        startActivity(bp);
                        break;
                    case 2:
                        Intent cp=new Intent(getContext(),R3.class);
                        startActivity(cp);
                        break;
                    case 3:
                        Intent dp=new Intent(getContext(),R4.class);
                        startActivity(dp);
                        break;
                    case 4:
                        Intent ep=new Intent(getContext(),R5.class);
                        startActivity(ep);
                        break;
                    case 5:
                        Intent fp=new Intent(getContext(),R6.class);
                        startActivity(fp);
                        break;
                    case 6:
                        Intent gp=new Intent(getContext(),R7.class);
                        startActivity(gp);
                        break;
                    case 7:
                        Intent hp=new Intent(getContext(),R8.class);
                        startActivity(hp);
                        break;
                    case 8:
                        Intent ip=new Intent(getContext(),R9.class);
                        startActivity(ip);
                        break;
                    case 9:
                        Intent jp=new Intent(getContext(),R10.class);
                        startActivity(jp);
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

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {




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
