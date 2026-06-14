package com.example.rungps.ble.moyoung;

import com.caverock.androidsvg.SVGParser;
import kotlin.Metadata;

/* compiled from: MoyoungSportLabels.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/example/rungps/ble/moyoung/MoyoungSportLabels;", "", "<init>", "()V", "SPORT_WALK", "", "SPORT_RUN", "SPORT_CYCLING", "SPORT_INDOOR_CYCLING", "label", "", SVGParser.XML_STYLESHEET_ATTR_TYPE, "isFootball", "", "importTarget", "Lcom/example/rungps/ble/moyoung/WatchImportTarget;", "sportType", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MoyoungSportLabels {
    public static final int $stable = 0;
    public static final MoyoungSportLabels INSTANCE = new MoyoungSportLabels();
    public static final int SPORT_CYCLING = 2;
    public static final int SPORT_INDOOR_CYCLING = 17;
    public static final int SPORT_RUN = 1;
    public static final int SPORT_WALK = 0;

    public final boolean isFootball(int type) {
        return type == 6;
    }

    private MoyoungSportLabels() {
    }

    public final String label(int type) {
        switch (type) {
            case 0:
                return "Walk";
            case 1:
                return "Run";
            case 2:
                return "Cycling";
            case 3:
                return "Jump rope";
            case 4:
                return "Badminton";
            case 5:
                return "Basketball";
            case 6:
                return "Football";
            case 7:
                return "Swim";
            case 8:
                return "Hike";
            case 9:
                return "Tennis";
            case 10:
                return "Rugby";
            case 11:
                return "Golf";
            case 12:
                return "Yoga";
            case 13:
                return "Fitness";
            case 14:
                return "Dance";
            case 15:
                return "Baseball";
            case 16:
                return "Elliptical";
            case 17:
                return "Indoor cycling";
            case 18:
                return "Free exercise";
            case 19:
                return "Rowing";
            default:
                return "Sport " + type;
        }
    }

    public final WatchImportTarget importTarget(int sportType) {
        if (sportType != 0) {
            if (sportType == 1) {
                return WatchImportTarget.RUN;
            }
            if (sportType != 2) {
                if (sportType != 8) {
                    if (sportType != 17) {
                        return WatchImportTarget.SOCCER;
                    }
                }
            }
            return WatchImportTarget.BIKE;
        }
        return WatchImportTarget.SOCCER;
    }
}
