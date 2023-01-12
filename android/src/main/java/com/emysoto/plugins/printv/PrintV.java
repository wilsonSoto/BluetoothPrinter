package com.emysoto.plugins.printv;

import android.Manifest;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.dantsu.escposprinter.EscPosPrinter;
import com.dantsu.escposprinter.connection.bluetooth.BluetoothConnection;
import com.dantsu.escposprinter.connection.bluetooth.BluetoothPrintersConnections;
import java.text.DateFormat;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Date;
import java.util.Locale;
import java.util.Locale;

public class PrintV {

    private static final int GRAVITY_TOP = Gravity.TOP | Gravity.CENTER_HORIZONTAL;
    private static final int GRAVITY_CENTER = Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL;

    public static final int PERMISSION_BLUETOOTH = 1;

    private final Locale locale = new Locale("id", "ID");
    private final DateFormat df = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a", locale);
    private final NumberFormat nf = NumberFormat.getCurrencyInstance(locale);

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }

    public static void show(Context c, String text) {
        show(c, text, android.widget.Toast.LENGTH_LONG, "top");
    }

    public static void show(final Context c, final String text, final int duration, final String position) {
        new Handler(Looper.getMainLooper())
            .post(
                () -> {
                    android.widget.Toast toast = android.widget.Toast.makeText(c, text, duration);
                    if ("top".equals(position)) {
                        toast.setGravity(GRAVITY_TOP, 0, 40);
                    } else if ("center".equals(position)) {
                        toast.setGravity(GRAVITY_CENTER, 0, 0);
                    }
                    toast.show();
                }
            );
    }

    public Boolean testingMessage(Context c, String value) {
        System.out.println("Tiene Permiso, procediendo a usar printer");
        show(c, value);
        return true;
    }

    public Boolean getNotifications(Context c, String value) {
        System.out.println("Tiene Permiso, procediendo a usar printer");
        show(c, value);
        return true;
    }

    public void DisplayMessage(Context c, String message) {
        show(c, message);
    }

    public Boolean blPrint(Context c, String value) {
        try {
            BluetoothConnection connection = BluetoothPrintersConnections.selectFirstPaired();
            if (connection != null) {
                show(c, "Imprimiendo");

                EscPosPrinter printer = new EscPosPrinter(connection, 203, 48f, 32);
                printer.printFormattedText(value);
                connection.disconnect();
            } else {
                show(c, "No hay impresora conectada!");
            }
        } catch (Exception e) {
            show(c, "Error intentando imprimir " + e.getMessage());
        }
        return true;
    }
}
