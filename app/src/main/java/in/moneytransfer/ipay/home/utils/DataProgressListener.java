package in.moneytransfer.ipay.home.utils;

/**
 * Created by mayankchauhan on 19/08/17.
 */

public interface DataProgressListener {

    void onFetchStarted();
    void onFetchCompleted();
    void onFetchCancelled();
}
