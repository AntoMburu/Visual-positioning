package com.NBT_Tech.visuapositioningbusinesslocator.ui.superm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class superViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public superViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is super fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}