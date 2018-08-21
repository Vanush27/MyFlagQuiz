package am.user.myflagquiz;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.annotation.Nullable;

/**
 * Created by Vanush all rights reserved.
 */
public class SettingsActivityFragment extends PreferenceFragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // load from xml
        addPreferencesFromResource(R.xml.preferences);
    }
}
