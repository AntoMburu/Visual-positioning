package com.NBT_Tech.visuapositioningbusinesslocator.ui.education;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class educationViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public educationViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is education fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}