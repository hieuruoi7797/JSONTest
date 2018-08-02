package vn.hieuruoi.jsontest0;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import vn.hieuruoi.jsontest0.models.Data;
import vn.hieuruoi.jsontest0.models.Owner;


public class FetchData extends AsyncTask<String, Void, ArrayList<Data>> {
    private static final String KEY_ID = "id";
    private static final String KEY_NODE_ID = "node_id";
    private static final String KEY_NAME = "name";
    private static final String KEY_FULL_NAME = "full_name";
    private static final String KEY_OWNER = "owner";
    private static final String KEY_OWNER_ID = "id";
    private static final String KEY_OWNER_AVATAR_URL = "avatar_url";
    private static final String REQUEST_METHOD = "GET";
    private OnLoadDataFinishedListener mListener;

    public FetchData(OnLoadDataFinishedListener listener) {
        this.mListener = listener;
    }


    @Override
    protected ArrayList<Data> doInBackground(String... strings) {
        StringBuilder response = new StringBuilder();
        String apiEndPoint = strings[0];
        try {
            URL url = new URL(apiEndPoint);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod(REQUEST_METHOD);

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            while ((inputLine = bufferedReader.readLine()) != null) {
                response.append(inputLine);
            }
            bufferedReader.close();
            connection.disconnect();
        }
        catch (MalformedURLException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        ArrayList<Data> datas = getDataFromResponse(response.toString());
        return datas;
    }

    private ArrayList<Data> getDataFromResponse(String s) {
        ArrayList<Data> dataArrayList = new ArrayList<>();
        try {
            JSONArray jsonArray = new JSONArray(s);

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                int id = jsonObject.getInt(KEY_ID);
                String nodeID = jsonObject.optString(KEY_NODE_ID);
                String name = jsonObject.optString(KEY_NAME);
                String fullName = jsonObject.optString(KEY_FULL_NAME);
                JSONObject ownerObject = jsonObject.getJSONObject(KEY_OWNER);
                int ownerId = ownerObject.getInt(KEY_OWNER_ID);
                String ownerAvatar = ownerObject.optString(KEY_OWNER_AVATAR_URL);

                dataArrayList.add(new Data(id,nodeID,name,fullName,new Owner(ownerId,ownerAvatar)));

            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return dataArrayList;
    }

    @Override
    protected void onPostExecute(ArrayList<Data> datas){
        super.onPostExecute(datas);
        mListener.onLoadFinished(datas);
    }

    interface OnLoadDataFinishedListener {
        void onLoadFinished(ArrayList<Data> datas);
    }
}
