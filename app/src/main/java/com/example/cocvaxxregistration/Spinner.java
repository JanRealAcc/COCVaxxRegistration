package com.example.cocvaxxregistration;

public class Spinner {

    /*
      <ScrollView
              android:layout_width="match_parent"
              android:layout_height="match_parent">

              <LinearLayout
                  android:layout_width="match_parent"
                  android:layout_height="match_parent"
                  android:paddingHorizontal="20dp"
                  android:orientation="vertical"
                  android:layout_marginTop="30dp">


                  <ImageView
                      android:layout_width="match_parent"
                      android:layout_height="wrap_content"
                      android:src="@drawable/coc" />





                  <TextView
                      android:layout_width="match_parent"
                      android:layout_height="wrap_content"
                      android:layout_marginTop="20dp"
                      android:fontFamily="@font/montserrat"
                      android:text="REGISTRATION"
                      android:textAlignment="center"
                      android:textSize="30dp"
                      android:textStyle="bold" />

                  <TextView
                      android:layout_width="match_parent"
                      android:layout_height="wrap_content"
                      android:layout_marginTop="40dp"
                      android:text="P E R S O N A L  -  P R O F I L E"
                      android:textSize="15dp"
                      android:textColor="@color/black"
                      android:textStyle="bold"
                      android:textAlignment="center"/>








                  <TextView
                      android:layout_width="match_parent"
                      android:layout_height="wrap_content"
                      android:layout_marginTop="20dp"
                      android:text="First Name:" />



                  <EditText
                      android:id="@+id/et_fName"
                      android:layout_width="match_parent"
                      android:layout_height="wrap_content"
                      android:inputType="textPersonName"
                      android:hint="Ex. Janrylle"

                      tools:ignore="SpeakableTextPresentCheck" />

                  <TextView
                      android:layout_width="match_parent"
                      android:layout_height="wrap_content"
                      android:layout_marginTop="10dp"
                      android:text="Last Name:"
                      android:inputType="textPersonName"/>

                  <EditText
                      android:id="@+id/et_lName"
                      android:layout_width="match_parent"
                      android:layout_height="wrap_content"
                      android:hint="Ex. Espinosa"
                      tools:ignore="SpeakableTextPresentCheck" />

                  <TextView
                      android:layout_width="match_parent"
                      android:layout_height="wrap_content"
                      android:layout_marginTop="10dp"
                      android:text="Email Address:" />

                  <EditText
                      android:id="@+id/et_email"
                      android:layout_width="match_parent"
                      android:layout_height="wrap_content"
                      android:inputType="textEmailAddress"
                      android:hint="Ex. jaqu.espinosa.coc@phinmaed.com"/>
                  <TextView
                      android:layout_width="match_parent"
                      android:layout_height="wrap_content"
                      android:layout_marginTop="10dp"
                      android:text="Phone:" />

                  <EditText
                      android:id="@+id/et_phone"
                      android:layout_width="match_parent"
                      android:layout_height="wrap_content"
                      android:inputType="number"
                      android:hint="Ex. 09123456789"/>

                  <TextView
                      android:layout_width="match_parent"
                      android:layout_height="wrap_content"
                      android:layout_marginTop="10dp"
                      android:text="Password:" />

                  <EditText
                      android:id="@+id/et_password"
                      android:layout_width="match_parent"
                      android:layout_height="wrap_content"
                      android:inputType="textPassword"
                      tools:ignore="SpeakableTextPresentCheck" />

                  <TextView
                      android:layout_width="match_parent"
                      android:layout_height="wrap_content"
                      android:layout_marginTop="10dp"
                      android:text="Age:" />

                  <EditText
                      android:id="@+id/et_age"
                      android:layout_width="match_parent"
                      android:layout_height="wrap_content"
                      android:inputType="number"
                      tools:ignore="SpeakableTextPresentCheck" />

                  <TextView
                      android:layout_width="match_parent"
                      android:layout_height="wrap_content"
                      android:layout_marginTop="10dp"
                      android:text="Birthdate:" />

                  <Button
                      android:layout_width="match_parent"
                      android:layout_height="wrap_content"
                      android:hint="SELECT DATE"
                      android:textColorHint="@color/white"
                      android:id="@+id/btn_bDate"/>

                  <TextView
                      android:layout_width="match_parent"
                      android:layout_height="wrap_content"
                      android:layout_marginTop="10dp"
                      android:text="Gender:" />

                  <RadioGroup
                      android:layout_width="match_parent"
                      android:layout_height="match_parent" >

                      <RadioButton
                          android:id="@+id/radio_male"
                          android:layout_width="match_parent"
                          android:layout_height="wrap_content"
                          android:text="Male" />

                      <RadioButton
                          android:id="@+id/radio_female"
                          android:layout_width="match_parent"
                          android:layout_height="wrap_content"
                          android:text="Female" />

                  </RadioGroup>

                  <TextView
                      android:layout_width="match_parent"
                      android:layout_height="wrap_content"
                      android:layout_marginTop="10dp"
                      android:text="Address:" />

                  <EditText
                      android:id="@+id/et_address"
                      android:layout_width="match_parent"
                      android:layout_height="wrap_content"
                      android:inputType="text" />

                  <TextView
                      android:layout_width="match_parent"
                      android:layout_height="wrap_content"
                      android:layout_marginTop="10dp"
                      android:text="Municipality:" />

                  <Spinner
                      android:id="@+id/spin_city"
                      android:layout_width="match_parent"
                      android:layout_height="40dp"/>

                  <TextView
                      android:layout_width="match_parent"
                      android:layout_height="wrap_content"
                      android:layout_marginTop="40dp"
                      android:text="S C H O O L  -  P R O F I L E"
                      android:textSize="15dp"
                      android:textColor="@color/black"
                      android:textStyle="bold"
                      android:textAlignment="center"/>

                  <TextView
                      android:layout_width="match_parent"
                      android:layout_height="wrap_content"
                      android:layout_marginTop="20dp"
                      android:text="School ID:" />

                  <EditText
                      android:id="@+id/et_schoolID"
                      android:layout_width="match_parent"
                      android:layout_height="wrap_content"
                      android:inputType="number"
                      android:hint="Ex. 02-1819-00743"/>

                  <TextView
                      android:layout_width="match_parent"
                      android:layout_height="wrap_content"
                      android:layout_marginTop="20dp"
                      android:textColor="@color/black"
                      android:text="Course:" />

                  <Spinner
                      android:id="@+id/spin_course"
                      android:layout_width="match_parent"
                      android:layout_height="40dp"/>

                  <TextView
                      android:layout_width="match_parent"
                      android:layout_height="wrap_content"
                      android:layout_marginTop="20dp"
                      android:text="Year Level:" />

                  <Spinner
                      android:id="@+id/spin_yearLevel"
                      android:layout_width="match_parent"
                      android:layout_height="40dp"/>

                  <TextView
                      android:layout_width="match_parent"
                      android:layout_height="wrap_content"
                      android:layout_marginTop="40dp"
                      android:text="V A C C I N A T I O N -  I N F O"
                      android:textSize="15dp"
                      android:textColor="@color/black"
                      android:textStyle="bold"
                      android:textAlignment="center"/>

                  <TextView
                      android:layout_width="match_parent"
                      android:layout_height="wrap_content"
                      android:layout_marginTop="20dp"
                      android:text="Vaccine:" />

                  <Spinner
                      android:id="@+id/spin_vaccine"
                      android:layout_width="match_parent"
                      android:layout_height="40dp"/>

                  <TextView
                      android:layout_width="match_parent"
                      android:layout_height="wrap_content"
                      android:layout_marginTop="20dp"
                      android:text="No. of Dose:" />

                  <RadioGroup
                      android:layout_width="match_parent"
                      android:layout_height="match_parent" >

                      <RadioButton
                          android:id="@+id/radio_firstDose"
                          android:layout_width="match_parent"
                          android:layout_height="wrap_content"
                          android:text="1st Dose" />

                      <RadioButton
                          android:id="@+id/radio_secondDose"
                          android:layout_width="match_parent"
                          android:layout_height="wrap_content"
                          android:text="2nd Dose" />

                      <RadioButton
                          android:id="@+id/radio_fullVaccine"
                          android:layout_width="match_parent"
                          android:layout_height="wrap_content"
                          android:text="Fully Vaccinated + Booster"/>
                  </RadioGroup>

                  <Button
                      android:id="@+id/btn_submit"
                      android:layout_width="match_parent"
                      android:layout_height="wrap_content"
                      android:height="50dp"
                      android:layout_marginBottom="50dp"
                      android:layout_marginTop="40dp"
                      android:text="Submit"
                      android:textColor="@color/white"/>





              </LinearLayout>

          </ScrollView>
     */
}
