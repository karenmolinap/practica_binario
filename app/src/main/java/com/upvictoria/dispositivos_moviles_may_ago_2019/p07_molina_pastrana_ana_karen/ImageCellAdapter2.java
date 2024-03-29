package com.upvictoria.dispositivos_moviles_may_ago_2019.p07_molina_pastrana_ana_karen;

/*
 * Copyright (C) 2013 Wglxy.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * (Note to other developers: The above note says you are free to do what you want with this code.
 *  Any problems are yours to fix. Wglxy.com is simply helping you get started. )
 */

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * This class is used with a GridView object. It provides a set of ImageCell objects 
 * that support dragging and dropping. An View.OnDragListener object can be provided
 * when you create the adapter.
 *
 */

public class ImageCellAdapter2 extends BaseAdapter
{

/**
 */
// Variables
public ViewGroup mParentView = null;
public int mNumImages;
private Context mContext;
private View.OnDragListener mDragListener = null;

public ImageCellAdapter2(Context c) {
    mContext = c;
    mDragListener = null;
    mNumImages = 0;
}

public ImageCellAdapter2(Context c, View.OnDragListener l, int numImages) {
    mContext = c;
    mDragListener = l;
    mNumImages = numImages;
}

/**
 */
// Methods

/**
 * getCount
 */

public int getCount() 
{
    Resources res = mContext.getResources();
    int numImages = mNumImages;
    return numImages;
}

public Object getItem(int position) 
{
    return null;
}

public long getItemId(int position) {
    return position;
}

/**
 * getView
 * Return a view object for the grid.
 * 
 * @return ImageCell
 */
public View getView (int position, View convertView, ViewGroup parent) 
{
    Resources res = mContext.getResources ();
    int cellWidth = res.getDimensionPixelSize (R.dimen.grid_cell_width);
    int cellHeight = res.getDimensionPixelSize (R.dimen.grid_cell_height);
    int cellPad = res.getDimensionPixelSize (R.dimen.grid_cell_padding);
    mParentView = parent;

    ImageCell2 v = null;
    if (convertView == null) {
        // If it's not recycled, create a new ImageCell.
        v = new ImageCell2 (mContext);
        v.setLayoutParams(new GridView.LayoutParams (cellWidth, cellHeight));
        v.setScaleType(ImageView.ScaleType.CENTER_CROP);
        v.setPadding (cellPad, cellPad, cellPad, cellPad);

    } else {
        v = (ImageCell2) convertView;
        v.setImageDrawable (null);     // Important. Otherwise, recycled views show old image.
    }

    v.mCellNumber = position;
    v.mGrid = (GridView) mParentView;
    v.mEmpty = true;
    v.setOnDragListener (mDragListener);
    v.setBackgroundResource (R.color.cell_empty);

    // Set up to relay events to the activity.
    // The activity decides which events trigger drag operations.
    // Activities like the Android Launcher require a long click to get a drag operation started.
    v.setOnTouchListener ((View.OnTouchListener) mContext);
    v.setOnClickListener ((View.OnClickListener) mContext);
    v.setOnLongClickListener ((View.OnLongClickListener) mContext);

    return v;
}


} // end class
