package com.interglobe.mpos.motorsport.UI.helper;

import android.widget.Toast;

import com.interglobe.mpos.motorsport.Managers.BaseManagers.ApplicationManager;



public class Toaster {

    public static void toast(String string){
        Toast.makeText(ApplicationManager.getContext(), string, Toast.LENGTH_SHORT).show();
    }

   /* public static void toastRangeen(String string){
        Context context = ApplicationManager.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View layout = inflater.inflate(R.layout.custom_toast_yellow,null);
        TextView text = (TextView) layout.findViewById(R.id.toast_text);

        Toast toast = new Toast(context);
        toast.setGravity(Gravity.TOP, 0, 45);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        text.setText(string);
        toast.show();
    }

    public static void customToast(Context context, String message) {
        ViewGroup container = (ViewGroup) ((Activity) context).findViewById(R.id.toast_layout);
        View layout = ((Activity) context).getLayoutInflater().inflate(R.layout.custom_toast, container);
        TextView tvMessage = (TextView)layout.findViewById(R.id.toast_text);

        //Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);
        tvMessage.setText(message);
        toast.show();
    }
*/
}
