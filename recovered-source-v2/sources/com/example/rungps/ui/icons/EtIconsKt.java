package com.example.rungps.ui.icons;

import androidx.compose.ui.graphics.vector.ImageVector;
import com.adamglin.PhosphorIcons;
import com.adamglin.phosphoricons.FillGroup;
import com.adamglin.phosphoricons.RegularGroup;
import com.adamglin.phosphoricons.__FillKt;
import com.adamglin.phosphoricons.__RegularKt;
import com.example.rungps.ui.navigation.MainTab;
import com.example.rungps.ui.navigation.MoreDestination;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EtIcons.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\t2\b\b\u0002\u0010\u0007\u001a\u00020\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Reg", "Lcom/adamglin/phosphoricons/RegularGroup;", "Fil", "Lcom/adamglin/phosphoricons/FillGroup;", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/example/rungps/ui/navigation/MainTab;", "selected", "", "Lcom/example/rungps/ui/navigation/MoreDestination;", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EtIconsKt {
    private static final RegularGroup Reg = __RegularKt.getRegular(PhosphorIcons.INSTANCE);
    private static final FillGroup Fil = __FillKt.getFill(PhosphorIcons.INSTANCE);

    /* compiled from: EtIcons.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MainTab.values().length];
            try {
                iArr[MainTab.Home.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MainTab.Run.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MainTab.Gym.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MainTab.History.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MainTab.Recovery.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MoreDestination.values().length];
            try {
                iArr2[MoreDestination.Map.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[MoreDestination.Profile.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[MoreDestination.Week.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[MoreDestination.Coach.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[MoreDestination.Sleep.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[MoreDestination.Soccer.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[MoreDestination.Diagnostics.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[MoreDestination.Settings.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[MoreDestination.Gear.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final ImageVector icon(MainTab mainTab, boolean z) {
        Intrinsics.checkNotNullParameter(mainTab, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[mainTab.ordinal()];
        if (i == 1) {
            EtIcons etIcons = EtIcons.INSTANCE;
            return z ? etIcons.getHomeFill() : etIcons.getHome();
        }
        if (i == 2) {
            EtIcons etIcons2 = EtIcons.INSTANCE;
            return z ? etIcons2.getRunFill() : etIcons2.getRun();
        }
        if (i == 3) {
            EtIcons etIcons3 = EtIcons.INSTANCE;
            return z ? etIcons3.getGymFill() : etIcons3.getGym();
        }
        if (i == 4) {
            EtIcons etIcons4 = EtIcons.INSTANCE;
            return z ? etIcons4.getHistoryFill() : etIcons4.getHistory();
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        EtIcons etIcons5 = EtIcons.INSTANCE;
        return z ? etIcons5.getRecoveryFill() : etIcons5.getRecovery();
    }

    public static final ImageVector icon(MoreDestination moreDestination, boolean z) {
        Intrinsics.checkNotNullParameter(moreDestination, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[moreDestination.ordinal()]) {
            case 1:
                EtIcons etIcons = EtIcons.INSTANCE;
                return z ? etIcons.getMapFill() : etIcons.getMap();
            case 2:
                EtIcons etIcons2 = EtIcons.INSTANCE;
                return z ? etIcons2.getProfileFill() : etIcons2.getProfile();
            case 3:
                EtIcons etIcons3 = EtIcons.INSTANCE;
                return z ? etIcons3.getWeekFill() : etIcons3.getWeek();
            case 4:
                EtIcons etIcons4 = EtIcons.INSTANCE;
                return z ? etIcons4.getCoachFill() : etIcons4.getCoach();
            case 5:
                EtIcons etIcons5 = EtIcons.INSTANCE;
                return z ? etIcons5.getSleepFill() : etIcons5.getSleep();
            case 6:
                EtIcons etIcons6 = EtIcons.INSTANCE;
                return z ? etIcons6.getSoccerFill() : etIcons6.getSoccer();
            case 7:
                EtIcons etIcons7 = EtIcons.INSTANCE;
                return z ? etIcons7.getDiagnosticsFill() : etIcons7.getDiagnostics();
            case 8:
                EtIcons etIcons8 = EtIcons.INSTANCE;
                return z ? etIcons8.getSettingsFill() : etIcons8.getSettings();
            case 9:
                EtIcons etIcons9 = EtIcons.INSTANCE;
                return z ? etIcons9.getGearRackFill() : etIcons9.getGearRack();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static /* synthetic */ ImageVector icon$default(MoreDestination moreDestination, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return icon(moreDestination, z);
    }
}
