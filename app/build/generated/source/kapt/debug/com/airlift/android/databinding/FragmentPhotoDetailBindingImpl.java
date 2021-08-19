package com.airlift.android.databinding;
import com.airlift.android.R;
import com.airlift.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPhotoDetailBindingImpl extends FragmentPhotoDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvDimensionsLabel, 5);
        sViewsWithIds.put(R.id.tvAvgColorLabel, 6);
        sViewsWithIds.put(R.id.divider1, 7);
        sViewsWithIds.put(R.id.tvPhotographerLabel, 8);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPhotoDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentPhotoDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.view.View) bindings[7]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[1]
            , (com.google.android.material.textview.MaterialTextView) bindings[6]
            , (com.google.android.material.textview.MaterialTextView) bindings[2]
            , (com.google.android.material.textview.MaterialTextView) bindings[5]
            , (com.google.android.material.textview.MaterialTextView) bindings[8]
            , (com.google.android.material.textview.MaterialTextView) bindings[4]
            );
        this.ivAvgColor.setTag(null);
        this.ivPhoto.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvDimensions.setTag(null);
        this.tvPhotographerName.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.airlift.android.modules.detail.viewmodel.PhotoDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.airlift.android.modules.detail.viewmodel.PhotoDetailViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelImageUrl((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelImageDimens((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelPhotographer((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelAvgColor((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelImageUrl(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelImageUrl, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelImageDimens(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelImageDimens, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPhotographer(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelPhotographer, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAvgColor(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelAvgColor, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelImageUrl = null;
        java.lang.String viewModelImageDimensGetValue = null;
        java.lang.String viewModelAvgColorGetValue = null;
        java.lang.String viewModelImageUrlGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelImageDimens = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPhotographer = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelAvgColor = null;
        com.airlift.android.modules.detail.viewmodel.PhotoDetailViewModel viewModel = mViewModel;
        java.lang.String viewModelPhotographerGetValue = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.imageUrl
                        viewModelImageUrl = viewModel.getImageUrl();
                    }
                    updateLiveDataRegistration(0, viewModelImageUrl);


                    if (viewModelImageUrl != null) {
                        // read viewModel.imageUrl.getValue()
                        viewModelImageUrlGetValue = viewModelImageUrl.getValue();
                    }
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.imageDimens
                        viewModelImageDimens = viewModel.getImageDimens();
                    }
                    updateLiveDataRegistration(1, viewModelImageDimens);


                    if (viewModelImageDimens != null) {
                        // read viewModel.imageDimens.getValue()
                        viewModelImageDimensGetValue = viewModelImageDimens.getValue();
                    }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.photographer
                        viewModelPhotographer = viewModel.getPhotographer();
                    }
                    updateLiveDataRegistration(2, viewModelPhotographer);


                    if (viewModelPhotographer != null) {
                        // read viewModel.photographer.getValue()
                        viewModelPhotographerGetValue = viewModelPhotographer.getValue();
                    }
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.avgColor
                        viewModelAvgColor = viewModel.getAvgColor();
                    }
                    updateLiveDataRegistration(3, viewModelAvgColor);


                    if (viewModelAvgColor != null) {
                        // read viewModel.avgColor.getValue()
                        viewModelAvgColorGetValue = viewModelAvgColor.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            com.airlift.android.util.BindingAdapterKt.loadHexCode(this.ivAvgColor, viewModelAvgColorGetValue);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            com.airlift.android.util.BindingAdapterKt.loadImage(this.ivPhoto, viewModelImageUrlGetValue);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDimensions, viewModelImageDimensGetValue);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPhotographerName, viewModelPhotographerGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.imageUrl
        flag 1 (0x2L): viewModel.imageDimens
        flag 2 (0x3L): viewModel.photographer
        flag 3 (0x4L): viewModel.avgColor
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}