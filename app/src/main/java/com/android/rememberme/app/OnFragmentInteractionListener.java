package com.android.rememberme.app;

import android.net.Uri;

import com.android.rememberme.app.models.TaskModel;

/**
 * Created by esandoval on 25/04/15.
 */
public interface OnFragmentInteractionListener {
    void onFragmentInteraction(Uri uri);

    void onSaveDate(TaskModel taskModel);
}
