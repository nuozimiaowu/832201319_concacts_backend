package com.sty.service;

import com.sty.entity.Contact;
import com.sty.respository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    // 添加联系人
    public Contact addContact(Contact contact) {
        return contactRepository.save(contact);
    }

    // 修改联系人
    public Contact updateContact(Long id, Contact contactDetails) {
        Optional<Contact> optionalContact = contactRepository.findById(id);
        if (optionalContact.isPresent()) {
            Contact contact = optionalContact.get();
            contact.setName(contactDetails.getName());
            contact.setGender(contactDetails.getGender());
            contact.setPhoneNumber(contactDetails.getPhoneNumber());
            contact.setRemarks(contactDetails.getRemarks());
            return contactRepository.save(contact);
        } else {
            throw new RuntimeException("Contact not found");
        }
    }

    // 删除联系人
    public void deleteContact(Long id) {
        if (contactRepository.existsById(id)) {
            contactRepository.deleteById(id);
        } else {
            throw new RuntimeException("Contact not found");
        }
    }

    // 获取所有联系人
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    // 根据ID获取联系人
    public Contact getContactById(Long id) {
        return contactRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contact not found"));
    }
}
