package _04_singleton._05_monostate;

// This may work with old normal classes that we want to convert to singleton
// but we are already use them in multiple places
// so that we convert all fields to static so that they share same values

// IT IS VERY BAD and do not tell the user that this is a singleton
// Do not do it unless u really have to!