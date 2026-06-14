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

/* compiled from: Falloutshelter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FalloutShelter", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getFalloutShelter", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_falloutShelter", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FalloutshelterKt {
    private static ImageVector _falloutShelter;

    public static final ImageVector getFalloutShelter(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _falloutShelter;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FalloutShelter", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 32.0f);
        pathBuilder.arcToRelative(96.0f, 96.0f, 0.0f, true, false, 96.0f, 96.0f);
        pathBuilder.arcTo(96.0f, 96.0f, 0.0f, false, false, 128.0f, 32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 176.0f);
        pathBuilder.lineTo(128.0f, 128.0f);
        pathBuilder.lineTo(96.0f, 176.0f);
        pathBuilder.lineTo(64.0f, 128.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.lineTo(96.0f, 80.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.lineToRelative(-32.0f, 48.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(128.0f, 24.0f);
        pathBuilder2.arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f);
        pathBuilder2.arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 216.0f);
        pathBuilder2.arcToRelative(88.0f, 88.0f, 0.0f, true, true, 88.0f, -88.0f);
        pathBuilder2.arcTo(88.1f, 88.1f, 0.0f, false, true, 128.0f, 216.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(199.05f, 124.23f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 192.0f, 120.0f);
        pathBuilder2.lineTo(143.0f, 120.0f);
        pathBuilder2.lineToRelative(23.71f, -35.56f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 72.0f);
        pathBuilder2.lineTo(96.0f, 72.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.66f, 12.44f);
        pathBuilder2.lineTo(113.05f, 120.0f);
        pathBuilder2.lineTo(64.0f, 120.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.66f, 12.44f);
        pathBuilder2.lineToRelative(32.0f, 48.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.32f, 0.0f);
        pathBuilder2.lineToRelative(25.34f, -38.0f);
        pathBuilder2.lineToRelative(25.34f, 38.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.32f, 0.0f);
        pathBuilder2.lineToRelative(32.0f, -48.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 199.05f, 124.23f);
        pathBuilder2.close();
        pathBuilder2.moveTo(145.05f, 88.0f);
        pathBuilder2.lineTo(128.0f, 113.58f);
        pathBuilder2.lineTo(111.0f, 88.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(96.0f, 161.58f);
        pathBuilder2.lineTo(79.0f, 136.0f);
        pathBuilder2.horizontalLineToRelative(34.1f);
        pathBuilder2.close();
        pathBuilder2.moveTo(160.0f, 161.58f);
        pathBuilder2.lineTo(143.0f, 136.0f);
        pathBuilder2.horizontalLineToRelative(34.1f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _falloutShelter = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
