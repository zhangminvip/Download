package com.example.download.callback_interface;

/**
 * Created by tom on 2017/6/23.
 */

public interface DownloadListener {

    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPaused();

    void onCanceled();
}
