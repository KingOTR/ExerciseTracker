package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Usercirclecheck.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"UserCircleCheck", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getUserCircleCheck", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_userCircleCheck", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UsercirclecheckKt {
    private static ImageVector _userCircleCheck;

    public static final ImageVector getUserCircleCheck(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _userCircleCheck;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("UserCircleCheck", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(221.35f, 104.11f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.57f, 9.21f);
        pathBuilder.arcTo(88.85f, 88.85f, 0.0f, false, true, 216.0f, 128.0f);
        pathBuilder.arcToRelative(87.62f, 87.62f, 0.0f, false, true, -22.24f, 58.41f);
        pathBuilder.arcToRelative(79.66f, 79.66f, 0.0f, false, false, -36.06f, -28.75f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, true, false, -59.4f, 0.0f);
        pathBuilder.arcToRelative(79.66f, 79.66f, 0.0f, false, false, -36.06f, 28.75f);
        pathBuilder.arcTo(88.0f, 88.0f, 0.0f, false, true, 128.0f, 40.0f);
        pathBuilder.arcToRelative(88.76f, 88.76f, 0.0f, false, true, 14.68f, 1.22f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.64f, -15.78f);
        pathBuilder.arcToRelative(103.92f, 103.92f, 0.0f, true, false, 85.24f, 85.24f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 221.35f, 104.11f);
        pathBuilder.close();
        pathBuilder.moveTo(96.0f, 120.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 32.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, true, 96.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(74.08f, 197.5f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, true, 107.84f, 0.0f);
        pathBuilder.arcToRelative(87.83f, 87.83f, 0.0f, false, true, -107.84f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(237.66f, 45.66f);
        pathBuilder.lineToRelative(-32.0f, 32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f);
        pathBuilder.lineToRelative(-16.0f, -16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f);
        pathBuilder.lineTo(200.0f, 60.69f);
        pathBuilder.lineToRelative(26.34f, -26.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _userCircleCheck = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
