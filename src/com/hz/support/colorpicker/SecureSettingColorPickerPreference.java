package com.hz.support.colorpicker;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.provider.Settings;

import com.hz.support.preferences.SecureSettingsStore;
import com.hz.support.colorpicker.ColorPickerPreference;
public class SecureSettingColorPickerPreference extends ColorPickerPreference {

    public SecureSettingColorPickerPreference(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setPreferenceDataStore(new SecureSettingsStore(context.getContentResolver()));
    }

    public SecureSettingColorPickerPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
        setPreferenceDataStore(new SecureSettingsStore(context.getContentResolver()));
    }

    public SecureSettingColorPickerPreference(Context context) {
        super(context, null);
        setPreferenceDataStore(new SecureSettingsStore(context.getContentResolver()));
    }
}
