package com.airbnb.android.react.maps;

import android.graphics.Bitmap;

import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public class BitmapDescriptorContainer {
    private final int bitmapByteCount;
    private final BitmapDescriptor bitmapDescriptor;
    private final Bitmap bitmap;

    public BitmapDescriptorContainer(Bitmap bitmap) {
        bitmapByteCount = bitmap.getByteCount();
        bitmapDescriptor = BitmapDescriptorFactory.fromBitmap(bitmap);
        this.bitmap = bitmap;
    }

    public int getByteCount() {
        return bitmapByteCount;
    }

    public BitmapDescriptor getBitmapDescriptor() {
        return bitmapDescriptor;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }
}