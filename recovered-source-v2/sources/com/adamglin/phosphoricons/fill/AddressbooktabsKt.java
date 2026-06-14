package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Addressbooktabs.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"AddressBookTabs", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getAddressBookTabs", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_addressBookTabs", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AddressbooktabsKt {
    private static ImageVector _addressBookTabs;

    public static final ImageVector getAddressBookTabs(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _addressBookTabs;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("AddressBookTabs", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 32.0f);
        pathBuilder.lineTo(48.0f, 32.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f);
        pathBuilder.lineTo(32.0f, 208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.lineTo(208.0f, 224.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.lineTo(224.0f, 48.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(184.0f, 48.0f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.lineTo(208.0f, 88.0f);
        pathBuilder.lineTo(184.0f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(184.0f, 104.0f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.lineTo(184.0f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(146.0f, 175.75f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.74f, -5.76f);
        pathBuilder.curveToRelative(-2.63f, -10.26f, -13.06f, -18.0f, -24.25f, -18.0f);
        pathBuilder.reflectiveCurveToRelative(-21.61f, 7.74f, -24.25f, 18.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.5f, -4.0f);
        pathBuilder.arcToRelative(39.84f, 39.84f, 0.0f, false, true, 17.19f, -23.34f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, true, 45.12f, 0.0f);
        pathBuilder.arcTo(39.76f, 39.76f, 0.0f, false, true, 151.75f, 166.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 146.0f, 175.75f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 208.0f);
        pathBuilder.lineTo(184.0f, 208.0f);
        pathBuilder.lineTo(184.0f, 168.0f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 120.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 120.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _addressBookTabs = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
