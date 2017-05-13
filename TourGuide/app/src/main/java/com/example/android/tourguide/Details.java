package com.example.android.tourguide;

/**
 * Created by CRIZMA-PC&LAPTOP on 09/05/2017.
 */

public class Details {

    /**
     * name of the place
     */
    private String mPlaceName;

    /**
     * image of the place
     */
    private String mLocationPlace;

    /**
     * image resource id for the place
     **/
    private int mImagePlace;

    /**
     * telephone number of the place
     **/
    private String mPhoneNumber = No_Phone_Provided;

    /**
     * constant value that represents no phone number was provided for this place
     **/
    private static final String No_Phone_Provided = String.valueOf(-1);

    public Details(String PlaceName, String LocationPlace, int ImagePlace) {
        mPlaceName = PlaceName;
        mLocationPlace = LocationPlace;
        mImagePlace = ImagePlace;
    }


    public Details(String PlaceName, String LocationPlace, int ImagePlace, String PhoneNumber) {
        mPlaceName = PlaceName;
        mLocationPlace = LocationPlace;
        mImagePlace = ImagePlace;
        mPhoneNumber = PhoneNumber;
    }

    public String getPlaceName() {
        return mPlaceName;
    }

    public String getLocationPlace() {
        return mLocationPlace;
    }

    public int getImagePlace() {
        return mImagePlace;
    }

    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    public boolean hasPhone() {
        if (No_Phone_Provided != mPhoneNumber) {
            return true;
        } else return false;
    }
}
