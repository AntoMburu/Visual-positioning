package com.NBT_Tech.visuapositioningbusinesslocator.ui.clothing;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class clothingViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public clothingViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is clothing fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}