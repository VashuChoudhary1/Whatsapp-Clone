package com.vashu.choudhary.whatsappclone.data

data class Chat(
    val id: Int,
    val name: String,
    val time: String,
    val date: String?,
    val lastMessage: String?,
    val imageUrl: String?
)

data class Call(
    val id: Int,
    val name: String,
    val date: String,
    val imageUrl: String,
    val isMissCall: Boolean,
    val isIncoming: Boolean,
)

data class Message(
    val message: String,
    val isPeer: Boolean
)

object DummyData {
    val listChat = listOf(
        Chat(
            id = 0,
            name = "Honey",
            time = "18:46",
            date = "20 oct",
            lastMessage = "bye",
            imageUrl = "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiQmcqzN9KSMx-hxPJfiB3yt59uQhN9R4IqjisfUEitJv9lbQVN14QYLsUfmgiH-AoH2VgTFMdRBaTWa9XXpU9aMV1fveYnRgRsf4peaqt_rCR_qyQ483NgjHHdhfYpOr8axyGWhk3DHw5lAUQkXl6NGMugPS7k6Apw7CUjqRMgwAv01i2_AXyRumuBfw/s16000/blank-profile-picture-hd-images-photo.JPG"
        ),
        Chat(
            id = 1,
            name = "Raju Verma",
            time = "12:45",
            date = null,
            lastMessage = "Bhai padh le kal Paper h",
            imageUrl = "https://res.cloudinary.com/startup-grind/image/upload/c_fill,dpr_2.0,f_auto,g_center,h_250,q_auto:good,w_250/v1/gcs/platform-data-dsc/events/WhatsApp%20Image%202022-09-27%20at%2020.38.42.jpeg"
        ),
        Chat(
            id = 2,
            name = "ram Yadav",
            time = "13:00",
            date = "16 oct",
            lastMessage = "Bhai kal fail ho jaunga mai kuch nhi padha",
            imageUrl = "https://res.cloudinary.com/startup-grind/image/upload/c_fill,dpr_2.0,f_auto,g_center,h_250,q_auto:good,w_250/v1/gcs/platform-data-dsc/events/WhatsApp%20Image%202022-09-27%20at%2020.38.42%20%281%29.jpeg"
        ),
        Chat(
            id = 3,
            name = "yesh Gupta",
            time = "14:56",
            date = "16 oct",
            lastMessage = "Mai toh paper hi dene nhi aa rha ",
            imageUrl = "https://media-exp1.licdn.com/dms/image/D4D03AQFRk9alihEyjQ/profile-displayphoto-shrink_800_800/0/1646478227599?e=1671062400&v=beta&t=w4WYcuq6-OTGYtM0SbZzqff6QEa9IV-s1aMkgPFscBY"
        ),
        Chat(
            id = 4,
            name = "Mahi",
            time = "15:00",
            date = "16 oct",
            lastMessage = "Yeh le syllabus padh le",
            imageUrl = "https://randomuser.me/api/portraits/women/67.jpg"
        ),
        Chat(
            id = 5,
            name = "Raj Jha ",
            time = "16:32",
            date = "16 oct",
            lastMessage = "Bhai kal event hai sambhal lena",
            imageUrl = "https://yqmedia.mogiio.com/post/720/0/0/32/313/xOOX4902.webp"
        ),
        Chat(
            id = 6,
            name = "vats",
            time = "14:55",
            date = "16 oct",
            lastMessage = "Sir meet kab karni hai?",
            imageUrl = "https://yqmedia.mogiio.com/post/720/0/0/32/313/xOOX4902.webp"
        ),
        Chat(
            id = 7,
            name = "Aman Bansal",
            time = "18:46",
            date = "16 oct",
            lastMessage = "Bhai layout ready hai",
            imageUrl = "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_960_720.png"
        ),

        )

    val listCall = listOf(
        Call(
            id = 0,
            name = "Raju Verma",
            date = "16 oct 15:13",
            imageUrl = "https://yqmedia.mogiio.com/post/720/0/0/32/313/xOOX4902.webp",
            isIncoming = true,
            isMissCall = false
        ),
        Call(
            id = 1,
            name = "Piyush yadav",
            date = "16 oct 14:03",
            imageUrl = "https://yqmedia.mogiio.com/post/720/0/0/32/313/xOOX4902.webp",
            isIncoming = true,
            isMissCall = true
        ),
        Call(
            id = 2,
            name = "mahi ",
            date = "16 oct 16:13",
            imageUrl = "https://yqmedia.mogiio.com/post/720/0/0/32/313/xOOX4902.webp",
            isIncoming = true,
            isMissCall = false
        ),
        Call(
            id = 3,
            name = "Tammana",
            date = "16 oct 12:13",
            imageUrl = "https://yqmedia.mogiio.com/post/720/0/0/32/313/xOOX4902.webp",
            isIncoming = true,
            isMissCall = true
        ),
        Call(
            id = 4,
            name = "virat",
            date = "16 oct 18:13",
            imageUrl = "https://yqmedia.mogiio.com/post/720/0/0/32/313/xOOX4902.webp",
            isIncoming = true,
            isMissCall = false
        ),

        )

    val listMessage = listOf(
        Message("Hi , how are you ?", false),
        Message("Iam fine, how are you ?", true),
        Message("Iam fine too", false),
        Message("What do you do ?", true),
        Message("Write an otes, and doing my work", false),
        Message("Wow, its so good ", true),
        Message("Yeah", false),
    )
}