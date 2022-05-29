package com.colossalcrow.learnandroid;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

public class DataBlob implements Parcelable {

    public int randCeil;
    public String nameStr;

    protected DataBlob(Parcel inParcel){
        randCeil = Integer.parseInt(inParcel.readString());
        nameStr = inParcel.readString();
    }

    public DataBlob( int randCeilVal, String nameStrVal){
        this.randCeil = randCeilVal;
        this.nameStr = nameStrVal;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(randCeil);
        dest.writeString(nameStr);
    }

    public static final Creator<DataBlob> CREATOR = new Creator<DataBlob>() {
        @Override
        public DataBlob createFromParcel(Parcel inParcel) {
            return new DataBlob(inParcel);
        }

        @Override
        public DataBlob[] newArray(int size) {
            return new DataBlob[size];
        }
    };

    @Override
    public int describeContents(){
        return 0;
    }
}
