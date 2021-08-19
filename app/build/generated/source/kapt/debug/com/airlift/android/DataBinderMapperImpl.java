package com.airlift.android;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.airlift.android.databinding.ActivityMainBindingImpl;
import com.airlift.android.databinding.FragmentCuratedPhotosListBindingImpl;
import com.airlift.android.databinding.FragmentHomeBindingImpl;
import com.airlift.android.databinding.FragmentMyCollectionBindingImpl;
import com.airlift.android.databinding.FragmentPhotoDetailBindingImpl;
import com.airlift.android.databinding.FragmentSplashBindingImpl;
import com.airlift.android.databinding.HolderClothingItemGridViewBindingImpl;
import com.airlift.android.databinding.HolderCuratedPhotoItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTCURATEDPHOTOSLIST = 2;

  private static final int LAYOUT_FRAGMENTHOME = 3;

  private static final int LAYOUT_FRAGMENTMYCOLLECTION = 4;

  private static final int LAYOUT_FRAGMENTPHOTODETAIL = 5;

  private static final int LAYOUT_FRAGMENTSPLASH = 6;

  private static final int LAYOUT_HOLDERCLOTHINGITEMGRIDVIEW = 7;

  private static final int LAYOUT_HOLDERCURATEDPHOTOITEM = 8;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(8);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.airlift.android.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.airlift.android.R.layout.fragment_curated_photos_list, LAYOUT_FRAGMENTCURATEDPHOTOSLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.airlift.android.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.airlift.android.R.layout.fragment_my_collection, LAYOUT_FRAGMENTMYCOLLECTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.airlift.android.R.layout.fragment_photo_detail, LAYOUT_FRAGMENTPHOTODETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.airlift.android.R.layout.fragment_splash, LAYOUT_FRAGMENTSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.airlift.android.R.layout.holder_clothing_item_grid_view, LAYOUT_HOLDERCLOTHINGITEMGRIDVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.airlift.android.R.layout.holder_curated_photo_item, LAYOUT_HOLDERCURATEDPHOTOITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCURATEDPHOTOSLIST: {
          if ("layout/fragment_curated_photos_list_0".equals(tag)) {
            return new FragmentCuratedPhotosListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_curated_photos_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMYCOLLECTION: {
          if ("layout/fragment_my_collection_0".equals(tag)) {
            return new FragmentMyCollectionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_my_collection is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPHOTODETAIL: {
          if ("layout/fragment_photo_detail_0".equals(tag)) {
            return new FragmentPhotoDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_photo_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSPLASH: {
          if ("layout/fragment_splash_0".equals(tag)) {
            return new FragmentSplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_HOLDERCLOTHINGITEMGRIDVIEW: {
          if ("layout/holder_clothing_item_grid_view_0".equals(tag)) {
            return new HolderClothingItemGridViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for holder_clothing_item_grid_view is invalid. Received: " + tag);
        }
        case  LAYOUT_HOLDERCURATEDPHOTOITEM: {
          if ("layout/holder_curated_photo_item_0".equals(tag)) {
            return new HolderCuratedPhotoItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for holder_curated_photo_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(8);

    static {
      sKeys.put("layout/activity_main_0", com.airlift.android.R.layout.activity_main);
      sKeys.put("layout/fragment_curated_photos_list_0", com.airlift.android.R.layout.fragment_curated_photos_list);
      sKeys.put("layout/fragment_home_0", com.airlift.android.R.layout.fragment_home);
      sKeys.put("layout/fragment_my_collection_0", com.airlift.android.R.layout.fragment_my_collection);
      sKeys.put("layout/fragment_photo_detail_0", com.airlift.android.R.layout.fragment_photo_detail);
      sKeys.put("layout/fragment_splash_0", com.airlift.android.R.layout.fragment_splash);
      sKeys.put("layout/holder_clothing_item_grid_view_0", com.airlift.android.R.layout.holder_clothing_item_grid_view);
      sKeys.put("layout/holder_curated_photo_item_0", com.airlift.android.R.layout.holder_curated_photo_item);
    }
  }
}
