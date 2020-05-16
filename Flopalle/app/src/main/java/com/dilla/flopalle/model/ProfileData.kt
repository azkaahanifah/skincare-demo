package com.dilla.flopalle.model

import com.dilla.flopalle.R

object ProfileData {
    private val profilePhoto: Int = R.drawable.photo_profile
    private val profileName = "Hanifah Perdilla Onissa"
    private val profileBio = "I am Java Backend Developer. Has more than 1 year experience in IT field. Experienced in handling IT project in insurance services industry. Familiar to creating project integration, report and documentation."
    private val profileAddress = "Perumahan Cibubur Country, Cikeas Udik, Gunung Putri, Kabupaten Bogor, Jawa Barat 16966"
    private val profilePhone = "+628 968-596-291-3"
    private val profileMail = "azkaahanifah@gmail.com"
    private val profileSite = "www.azkaahanifah.blogspot.com"

    val detailProfile: Profile
        get() {
            val detail = Profile()
            detail.profilePhoto = profilePhoto
            detail.profileName = profileName
            detail.profileBio = profileBio
            detail.profileAddress = profileAddress
            detail.profilePhone = profilePhone
            detail.profileMail = profileMail
            detail.profileSite = profileSite
            return detail
        }
}