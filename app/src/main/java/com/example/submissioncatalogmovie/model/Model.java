package com.example.submissioncatalogmovie.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Model implements Parcelable {
    private String name;
    private String realease;
    private String detail;
    private String photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealease() {
        return realease;
    }

    public void setRealease(String realease) {
        this.realease = realease;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.realease);
        dest.writeString(this.detail);
        dest.writeString(this.photo);
    }

    public Model() {
    }

    protected Model(Parcel in) {
        this.name = in.readString();
        this.realease = in.readString();
        this.detail = in.readString();
        this.photo = in.readString();
    }

    public static final Parcelable.Creator<Model> CREATOR = new Parcelable.Creator<Model>() {
        @Override
        public Model createFromParcel(Parcel source) {
            return new Model(source);
        }

        @Override
        public Model[] newArray(int size) {
            return new Model[size];
        }
    };
}
