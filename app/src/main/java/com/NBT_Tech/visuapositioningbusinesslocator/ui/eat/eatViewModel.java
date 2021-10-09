package com.NBT_Tech.visuapositioningbusinesslocator.ui.eat;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class eatViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public eatViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is eat fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}