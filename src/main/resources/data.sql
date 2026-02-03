INSERT INTO patient (name, gender, birth_date, email, blood_group)
VALUES
    ('Abhishek Sharma', 'MALE', '2004-08-06', 'abhishek@gmail.com', 'O_POSITIVE'),
    ('Diya Patel', 'FEMALE', '2002-07-07', 'diya@gmail.com', 'A_POSITIVE'),
    ('Rahul Verma', 'MALE', '2003-05-14', 'rahul.verma@gmail.com', 'A_POSITIVE'),
    ('Sneha Patel', 'FEMALE', '2004-11-22', 'sneha.patel@gmail.com', 'B_POSITIVE'),
    ('Amit Kumar', 'MALE', '2002-02-09', 'amit.kumar@gmail.com', 'AB_NEGATIVE');


INSERT INTO doctor(name, specialization, email)
VALUES
    ('Dr. Rakesh Mehta', 'Cardiology', 'rakesh@gmail.com'),
    ('Dr. Sneha Kapoor', 'Dermatology', 'sneha@gmail.com'),
    ('Dr. Arjun Nair', 'Orthopedics', 'arjun@gmail.com');

INSERT INTO appointment (appointment_time, reason, doctor_id, patient_id)
VALUES
    ('2025-07-01 10:30:00', 'General Checkup', 1, 2),
    ('2025-07-02 11:00:00', 'Skin Rash', 2, 2),
    ('2025-07-03 09:45:00', 'Knee Pain', 3, 3),
    ('2025-07-04 14:00:00', 'Follow-up Visit', 1, 1),
    ('2025-07-05 16:15:00', 'Consultation', 1, 4),
    ('2025-07-06 08:30:00', 'Allergy Treatment', 2, 5);
