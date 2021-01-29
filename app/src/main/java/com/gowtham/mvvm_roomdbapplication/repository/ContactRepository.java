package com.gowtham.mvvm_roomdbapplication.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;


import com.gowtham.mvvm_roomdbapplication.database.ContactDao;
import com.gowtham.mvvm_roomdbapplication.database.ContactRoomDatabase;
import com.gowtham.mvvm_roomdbapplication.model.Contact;

import java.util.List;

public class ContactRepository {

    private ContactDao contactDao;
    private LiveData<List<Contact>> allContacts;

    public ContactRepository(Application application) {
        ContactRoomDatabase db = ContactRoomDatabase.getDatabase(application);
        contactDao = db.contactDao();

        allContacts = contactDao.getAllContacts();

    }
    public LiveData<List<Contact>> getAllData() {
        return allContacts;
    }

    public void insert(Contact contact) {
         ContactRoomDatabase.databaseWriteExecutor.execute(new Runnable() {
             @Override
             public void run() {
                 contactDao.insert(contact);
             }
         });
    }
    public LiveData<Contact> get(int id) {
         return contactDao.get(id);
    }

    public void update(Contact contact) {
        ContactRoomDatabase.databaseWriteExecutor.execute(() -> contactDao.update(contact));
    }

    public void delete(Contact contact) {
         ContactRoomDatabase.databaseWriteExecutor.execute(() -> contactDao.delete(contact));
    }

}
