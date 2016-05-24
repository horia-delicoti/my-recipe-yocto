SMMARY = "Example of how to build an external Linux kernel module"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module

SRC_URI = "git://github.com/horia-delicoti/kernel-module.git;protocol=ssh;branch=release_helloworld"

SRCREV = "2ece48defc879ae9cabb83dcc0b8edf85437bcb7"

S = "${WORKDIR}/git/"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.
