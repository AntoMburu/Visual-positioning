package com.NBT_Tech.visuapositioningbusinesslocator.ui.insuarance;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class insuaranceViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public insuaranceViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is insuarance fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}