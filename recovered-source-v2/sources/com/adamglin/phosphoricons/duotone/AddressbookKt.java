package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Addressbook.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"AddressBook", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getAddressBook", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_addressBook", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AddressbookKt {
    private static ImageVector _addressBook;

    public static final ImageVector getAddressBook(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _addressBook;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("AddressBook", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 32.0f);
        pathBuilder.horizontalLineTo(64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder.verticalLineTo(216.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f);
        pathBuilder.verticalLineTo(40.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(136.0f, 144.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, true, 136.0f, 144.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(83.19f, 174.4f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.21f, -1.6f);
        pathBuilder2.arcToRelative(52.0f, 52.0f, 0.0f, false, true, 83.2f, 0.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 12.8f, -9.6f);
        pathBuilder2.arcTo(67.88f, 67.88f, 0.0f, false, false, 163.0f, 141.51f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, true, false, -53.94f, 0.0f);
        pathBuilder2.arcTo(67.88f, 67.88f, 0.0f, false, false, 81.6f, 163.2f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 83.19f, 174.4f);
        pathBuilder2.close();
        pathBuilder2.moveTo(112.0f, 112.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, 24.0f);
        pathBuilder2.arcTo(24.0f, 24.0f, 0.0f, false, true, 112.0f, 112.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(208.0f, 24.0f);
        pathBuilder2.lineTo(64.0f, 24.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 40.0f);
        pathBuilder2.lineTo(48.0f, 64.0f);
        pathBuilder2.lineTo(32.0f, 64.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder2.lineTo(48.0f, 80.0f);
        pathBuilder2.verticalLineToRelative(40.0f);
        pathBuilder2.lineTo(32.0f, 120.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder2.lineTo(48.0f, 136.0f);
        pathBuilder2.verticalLineToRelative(40.0f);
        pathBuilder2.lineTo(32.0f, 176.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder2.lineTo(48.0f, 192.0f);
        pathBuilder2.verticalLineToRelative(24.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder2.lineTo(208.0f, 232.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder2.lineTo(224.0f, 40.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 24.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(208.0f, 216.0f);
        pathBuilder2.lineTo(64.0f, 216.0f);
        pathBuilder2.lineTo(64.0f, 40.0f);
        pathBuilder2.lineTo(208.0f, 40.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _addressBook = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
