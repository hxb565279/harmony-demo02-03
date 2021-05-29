package com.hxb.myapplication.slice;

import com.hxb.myapplication.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.Text;
import ohos.agp.window.dialog.ToastDialog;

public class RandomAbility extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_random);
        // 当点击登录，改变相应组件的样式
        Button button = (Button) findComponentById(ResourceTable.Id_ensure_button);
        button.setClickedListener((component -> {
            // 显示错误提示的Text
            Text min = (Text) findComponentById(ResourceTable.Id_name_textField);
            Text max = (Text) findComponentById(ResourceTable.Id_password_text_field);
            if (min == null || max == null) {
                ToastDialog toastDialog = new ToastDialog(this);
                toastDialog.setText(String.valueOf("输入为空")).setDuration(1000).show();
            } else {


                ToastDialog toastDialog = new ToastDialog(this);
                toastDialog.setText(String.valueOf("成功")).setDuration(1000).show();
            }
            Text text = (Text) findComponentById(ResourceTable.Id_error_tip_text);
            text.setVisibility(Component.VISIBLE);

            // 显示TextField错误状态下的样式
//            ShapeElement errorElement = new ShapeElement(this, ResourceTable.Graphic_background_text_field_error);
//            TextField textField = (TextField) findComponentById(ResourceTable.Id_text_field);
//            textField.setBackground(errorElement);

            // TextField失去焦点
//            textField.clearFocus();
        }));
    }
}
