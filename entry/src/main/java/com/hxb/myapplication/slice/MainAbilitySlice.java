package com.hxb.myapplication.slice;

import com.hxb.myapplication.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;

public class MainAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);
        Button button1 = (Button) findComponentById(ResourceTable.Id_button1);
        button1.setClickedListener(listener -> present(new RandomAbility(), new Intent()));
    }

    @Override
    public void onActive() {
        super.onActive();
    }


    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
