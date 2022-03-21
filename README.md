# 7DaysChallenge!

## Pages
-Json Page
-Lıst Page
-Locatıon Page
-Call Page

## Pages Descriptions
### Json Page
To print the data in the Json file in the application to the screen the recyclerView.
Raw/ application_names.json

### List Page
Printing the application list on the phone with the recyclerView.

### Location Page
Writing the latitude and longitude location information of the phone to the screen. <br/>
>Manifest;<br/>
   uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" <br/>
  uses-permission android:name="android.permission.ACCESS_FINE_LOCATION"<br/>
   uses-permission android:name="android.permission.INTERNET" /><br/>
Gradle; <br/>
    implementation 'com.google.android.gms:play-services-location:19.0.1'<br/>
## Call Page
Blocking an incoming call to the phone.
> Manifest; <br/>
    uses-permission android:name="android.permission.READ_PHONE_STATE"  <br/>
    uses-permission android:name="android.permission.CALL_PHONE"  <br/>


![JsonPage](https://user-images.githubusercontent.com/83831631/159350414-9c503178-077d-4abd-b9c6-d22fc31bb76b.PNG)
![ListPage](https://user-images.githubusercontent.com/83831631/159350489-ffc9cbd2-f21b-44b6-bc57-ee856323f64b.PNG)
![LocationPage](https://user-images.githubusercontent.com/83831631/159350494-4ffdd04b-78bf-4d88-856b-56792250fd75.PNG)
![CallPage](https://user-images.githubusercontent.com/83831631/159350496-df4703b0-68a6-4654-b48f-57c3c8599d57.PNG)
